import officeImage from "./images/office.jpg";

function App() {

  const officeList = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
      image: officeImage,
    },
    {
      name: "Infosys",
      rent: 75000,
      address: "Bangalore",
      image: officeImage,
    },
    {
      name: "TCS",
      rent: 45000,
      address: "Hyderabad",
      image: officeImage,
    },
    {
      name: "Wipro",
      rent: 90000,
      address: "Pune",
      image: officeImage,
    },
  ];

  return (
    <div style={{ margin: "30px" }}>

      <h1>Office Space, at Affordable Range</h1>

      {officeList.map((office, index) => (

        <div key={index} style={{ marginBottom: "40px" }}>

          <img
            src={office.image}
            alt="Office Space"
            width="250"
            height="180"
          />

          <h2>Name: {office.name}</h2>

          <h3
            style={{
              color: office.rent < 60000 ? "red" : "green",
            }}
          >
            Rent: Rs. {office.rent}
          </h3>

          <h3>Address: {office.address}</h3>

        </div>

      ))}

    </div>
  );
}

export default App;