import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = true;

    return (

        <div style={{ margin: "30px" }}>

            <h1>Blogger Dashboard</h1>

            <hr />

            {showBooks && <BookDetails />}

            {showBlogs ? <BlogDetails /> : null}

            {

                showCourses ?

                    <CourseDetails />

                    :

                    <h3>No Course Details Available</h3>

            }

        </div>

    );
}

export default App;