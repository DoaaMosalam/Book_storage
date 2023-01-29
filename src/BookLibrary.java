import java.util.ArrayList;
import java.util.Scanner;

public class BookLibrary{

    final ArrayList<Books> listBook = new ArrayList<>();

    public void library(){
        listBook.add(new Books("Moustafa Hosseny","rehlat Elhaya","Elshrouk","2019",32534535,1));
        listBook.add(new Books("Ahlam","Elaswad ealik beek","Alif","2011",534534,2));
        listBook.add(new Books("Ebrahim","zat","Elshrouk","2018",53547686,3));
        listBook.add(new Books("Groups of people","fan Elah mouballah","kyan","2017",34645679,4));
        listBook.add(new Books("Ahmed Khaled","Afrah Elmakbara","Kyan","2017",12313,2));

    }

    public void display() {
        library();
        System.out.println(listBook.toString());
        System.out.println(listBook.size());

        int index ;
        do {
            System.out.println("1.Add author book.");
            System.out.println("2.Add name book.");
            System.out.println("3.Add Home of publich: ");
            System.out.println("4.Add Data of publich: ");
            System.out.println("5.Add Id book");
            System.out.println("6.Add Number of Version Book: ");
            System.out.println("7. Delete author by id: ");
            System.out.println("8.Exit:\n");

            System.out.print("Choice [1:8]>> ");
            Scanner input = new Scanner(System.in);
            index= input.nextInt();

            if (index==1){
                String author ;
                System.out.println("1.Add author book.");
                System.out.println("type name of author: ");
                input.next();
                author = input.nextLine();
                listBook.add(new Books(author));
            }else if (index==2){
                String namebook;
                System.out.println("2.Add name book.");
                System.out.println("Type name book: ");
                input.next();
                namebook = input.nextLine();
                listBook.add(new Books(namebook));
            }else if (index ==3){
                String home;
                System.out.println("3.Add Home of publich: ");
                System.out.println("Type Home of publich: ");
                input.next();
                home = input.nextLine();
                listBook.add(new Books(home));
            }else if (index ==4){
                String data;
                System.out.println("4.Add Data of publich: ");
                System.out.println("Type data of publich: ");
                input.next();
                data = input.nextLine();
                listBook.add(new Books(data));



            }else if (index == 5){
                int id;
                System.out.println("5.Add Id book");
                System.out.println("Type id author book: ");
                id = input.nextInt();
                listBook.add(new Books(id));
            }else if (index==6){
                int version;
                System.out.println("6.Add Number of Version Book: ");
                System.out.println("Type number of version book: ");
                version = input.nextInt();
                listBook.add(new Books(version));
                System.out.println(listBook.size());
                System.out.println(listBook);
            }else if (index == 7){
                System.out.println("type id author you want delete: ");
                String st = input.nextLine();
                for (int i =0;i<listBook.size();i++){
                    if (st.equals(listBook.get(i).getAuthor())){
                        listBook.remove(i--);
                    }
                }
            }
            System.out.println(listBook.size());
        }while (index !=8);
    }

    public void print_info(){
        library();
        Scanner input = new Scanner(System.in);
        System.out.println("Type Home of Publich: ");
        String home = input.next();
        for (int y=0;y<listBook.size();y++){
            if (home.equals(listBook.get(y).getHomeofPublich())){
                System.out.println("****************************************");
                System.err.println("اسم الكاتب " + listBook.get(y).getAuthor());
                System.err.println("الكتاب " + listBook.get(y).getBook());
                System.err.println(" تاريخ النشر " + listBook.get(y).getDataPublish());
                System.err.println(" الااصدار " + listBook.get(y).getNumberVersion());

            }
        }
    }


}
