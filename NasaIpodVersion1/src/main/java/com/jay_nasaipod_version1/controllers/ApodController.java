package com.jay_nasaipod_version1.controllers;

import com.jay_nasaipod_version1.models.Apod;
import com.jay_nasaipod_version1.repos.ApodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Optional;

@RestController
@RequestMapping("/api/apod")
public class ApodController {

    @Autowired
    private Environment env;

    @Autowired
    private ApodRepository apodRepo;

    private final String BASE_URL = "https://api.nasa.gov/planetary/apod?api_key=";

    @GetMapping("/test")
    public ResponseEntity<?> testApod (RestTemplate restTemplate) {
        try{
            String apiKey = env.getProperty("APOD_API_KEY");
            String url = BASE_URL + apiKey;
            return restTemplate.getForEntity(url, Apod.class);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/range")
    public ResponseEntity<?> getRange (RestTemplate restTemplate, @RequestParam("start") String start, @RequestParam String end) {
        try{

            String apiKey = env.getProperty("APOD_API_KEY");
            String url = BASE_URL + apiKey + "&start_date=" + start + "&end_date=" + end;
            return restTemplate.getForEntity(url, Apod[].class);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll () {
        try{

            Iterable<Apod> allApods = apodRepo.findAll();

            return ResponseEntity.ok(allApods);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping("/range")
    public ResponseEntity<?> postRangeApods (RestTemplate restTemplate, @RequestParam("start") String start, @RequestParam String end) {
        try{

            System.out.println(start +" - " + end);

            String apiKey = env.getProperty("APOD_API_KEY");
            String url = BASE_URL + apiKey + "&start_date=" + start + "&end_date=" + end;
            Apod[] apods = restTemplate.getForObject(url, Apod[].class);

            assert apods != null;
            Iterable<Apod> savedApods = apodRepo.saveAll(Arrays.asList(apods));
            return ResponseEntity.ok(savedApods);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping("/scrape")
    public ResponseEntity<?> scrape (RestTemplate restTemplate) {
        try{

            String start = "";
            String end = "";

            System.out.println(start +" - " + end);

            String apiKey = env.getProperty("APOD_API_KEY");
            String url = BASE_URL + apiKey + "&start_date=" + start + "&end_date=" + end;
            Apod[] apods = restTemplate.getForObject(url, Apod[].class);

            assert apods != null;
            Iterable<Apod> savedApods = apodRepo.saveAll(Arrays.asList(apods));
            return ResponseEntity.ok(savedApods);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @DeleteMapping("/all")
    public ResponseEntity<?> deleteAll () {
        try{

            Iterable<Apod> allApods = apodRepo.findAll();

            apodRepo.deleteAll();

            return ResponseEntity.ok(allApods);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/date/{date}")
    public ResponseEntity<?> getByDate (@PathVariable String date) {
        try{

            Optional<Apod> foundApod = apodRepo.findByDate(date);

            if (foundApod.isEmpty())

                return ResponseEntity.notFound().build();

            return ResponseEntity.ok(foundApod);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
