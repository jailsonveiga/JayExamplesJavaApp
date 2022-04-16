import React from "react";

export default function ApodViewer(props) {
  const { date, copright, explanation, hdurl, title, url } = props.apod;

  return (
    <div>
      <h4>
        {title} - {date}
      </h4>
      <h5>{copright}</h5>
      <h6>{explanation}</h6>
      <img src={hdurl || url} alt={title} />
    </div>
  );
}
