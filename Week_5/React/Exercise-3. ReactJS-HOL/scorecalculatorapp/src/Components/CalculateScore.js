import "../Stylesheets/mystyle.css";

const formatPercentage = (value) => {
  return value.toFixed(2) + "%";
};

const calculateAverage = (total, goal) => {
  return formatPercentage((total / goal) * 100);
};

function CalculateScore({ Name, School, Total, goal }) {
  return (
    <div className="student-box">
      <h1>Student Details</h1>

      <p>
        <strong>Name:</strong> <span>{Name}</span>
      </p>

      <p>
        <strong>School:</strong> <span>{School}</span>
      </p>

      <p>
        <strong>Total:</strong> <span>{Total} Marks</span>
      </p>

      <p>
        <strong>Score:</strong>{" "}
        <span>{calculateAverage(Total, goal)}</span>
      </p>
    </div>
  );
}

export default CalculateScore;