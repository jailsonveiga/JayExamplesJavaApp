package com.jay_nasaipod_version1.models;

import javax.persistence.*;

@Entity
public class Apod {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 5000)
    private String copyright;

    @Column(updatable = false)
    private String date;

    @Column(length = 5000, updatable = false)
    private String explanation;

    @Column(updatable = false)
    private String hdurl;

    @Column(updatable = false)
    private String media_type;

    @Column(updatable = false)
    private String service_version;

    @Column(updatable = false)
    private String title;

    @Column(updatable = false)
    private String url;

    public long getId() {
        return id;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getHdurl() {
        return hdurl;
    }

    public String getMedia_type() {
        return media_type;
    }

    public String getService_version() {
        return service_version;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"copyright\":\"" + copyright + '"' +
                ", \"date\":\"" + date + '"' +
                ", \"explanation\":\"" + explanation + '"' +
                ", \"hdurl\":\"" + hdurl + '"' +
                ", \"media_type\":\"" + media_type + '"' +
                ", \"service_version\":\"" + service_version + '"' +
                ", \"title\":\"" + title + '"' +
                ", \"url\":\"" + url + '"' +
                '}';
    }
}
