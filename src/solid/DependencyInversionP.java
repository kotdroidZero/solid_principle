package solid;


// It is based on the Open/Closed Principle and the Liskov Substitution Principle.
public class DependencyInversionP {

}


class Book {
    public void seeReviews() {
        System.out.println("Seeing Reviews");
    }

    public void getSample() {
        System.out.println("Getting Sample");
    }
}

class Shelf {
    Book book;


    public void addBook() {
        System.out.println("Book Added on Shelf");
    }

    public void customizeShelf() {
        System.out.println("Shelf Rearranged");
    }
}

class DVD {
    public void seeReviews() {
        System.out.println("Seeing Reviews");
    }

    public void getSample() {
        System.out.println("Playing Sample");
    }
}

interface Product {

    public void seeReview();

    public void getSample();
}

        class BookV2 implements Product {

            @Override
            public void seeReview() {
                System.out.println("Seeing Book Reviews");
            }

            @Override
            public void getSample() {
                System.out.println("Getting Book Sample");
            }
        }

        class DVDV2 implements Product {

            @Override
            public void seeReview() {
                System.out.println("Seeing Movie Reviews");
            }

            @Override
            public void getSample() {
                System.out.println("Getting DVD Sample");
            }
        }

        class ShelfV2{
            Product product;

            public void addProduct() {
                System.out.println("Product Added on Shelf");
            }

            public void customizeShelf() {
                System.out.println("Shelf Rearranged");
            }
        }




