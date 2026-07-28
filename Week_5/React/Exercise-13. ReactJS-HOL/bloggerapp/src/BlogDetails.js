function BlogDetails() {

    const blogs = [
        {
            id: 1,
            title: "Learning React",
            writer: "John"
        },
        {
            id: 2,
            title: "JavaScript ES6",
            writer: "David"
        },
        {
            id: 3,
            title: "Frontend Development",
            writer: "Emma"
        }
    ];

    return (

        <div>

            <h2>Blog Details</h2>

            {

                blogs.map((blog) => (

                    <div key={blog.id}>

                        <h3>{blog.title}</h3>

                        <p>Writer : {blog.writer}</p>

                        <hr />

                    </div>

                ))

            }

        </div>

    );
}

export default BlogDetails;