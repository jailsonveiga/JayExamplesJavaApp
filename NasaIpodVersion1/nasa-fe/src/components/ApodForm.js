import React, { useState } from "react";
import ApodViewer from "./ApodViwer";

export default function ApodForm() {
  const [date, setDate] = useState(Date.now().toLocaleString());

  console.log(date);

  return (
    <div>
      <h2>NASA APOD Form</h2>
      <input type="date" value={date} />
      <ApodViewer
        apod={{
          id: 7,
          copyright: null,
          date: "1996-05-20",
          explanation:
            "Above is an image of the relatively quiet Sun made on May 18 in light emitted by ionized Helium atoms in the Solar chromosphere. Helium was first discovered in the Sun in 1868, its name fittingly derived from from the Greek word Helios, meaning Sun. Credit for the discovery goes to astronomer Joseph Lockyer. Lockyer relied on a recently developed technique of spectroscopy, dissecting sunlight into a spectrum, and the idea that each element produces a characteristic spectral pattern of bright lines. He noticed a yellow line in a solar spectrum made during an eclipse which could not be accounted for by elements known on Earth. Almost 27 years later Helium was finally discovered on Earth when the spectrum of a Helium bearing mineral of Uranium provided an exact match to the previously detected element of the Sun. Helium is now known to be the second most abundant element (after Hydrogen) in the Universe.",
          hdurl: "https://apod.nasa.gov/apod/image/hesun_eit_big.gif",
          media_type: "image",
          title: "Helios Helium",
          url: "https://apod.nasa.gov/apod/image/hesun_eit.gif",
        }}
      />
    </div>
  );
}
