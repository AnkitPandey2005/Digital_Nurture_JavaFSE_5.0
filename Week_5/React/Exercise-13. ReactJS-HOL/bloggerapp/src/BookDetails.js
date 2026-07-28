function BookDetails() {

    const books = [
        {
            id: 1,
            name: "Clean Code",
            author: "Robert Martin",
            price: 650
        },
        {
            id: 2,
            name: "Java Complete Reference",
            author: "Herbert Schildt",
            price: 780
        },
        {
            id: 3,
            name: "React in Action",
            author: "Mark Tielens Thomas",
            price: 720
        }
    ];

    return (

        <div>

            <h2>Book Details</h2>

            {

                books.map((book) => (

                    <div key={book.id}>

                        <h3>{book.name}</h3>

                        <p>Author : {book.author}</p>

                        <p>Price : ₹ {book.price}</p>

                        <hr />

                    </div>

                ))

            }

        </div>

    );
}

export default BookDetails;