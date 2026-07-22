package Exercise_2_E_commerce_Platform_Search_Function;

public class Demo {

    public static void main(String[] args) {

        Item items[] = {

                new Item(104,"Keyboard","Electronics"),
                new Item(101,"Laptop","Electronics"),
                new Item(106,"Bottle","Home"),
                new Item(102,"Mouse","Electronics"),
                new Item(109,"Shoes","Fashion")
        };

        int search = 102;

        Item ans = SearchData.linear(items, search);

        System.out.println("Using Linear Search");

        if(ans != null)
            System.out.println(ans.display());
        else
            System.out.println("Item not found");

        System.out.println();

        ans = SearchData.binary(items, search);

        System.out.println("Using Binary Search");

        if(ans != null)
            System.out.println(ans.display());
        else
            System.out.println("Item not found");
    }
}
