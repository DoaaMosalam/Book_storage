import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Author_Array extends author {

    public Author_Array() {

    }

    public Author_Array(String Author, String NameBook, String Mail, long Phone, long Id) {
        super(Author, NameBook, Mail, Phone, Id);
    }

    final ArrayList<author> list = new ArrayList<>();

    public void AuthorList() {
        list.add(new author("Pault Dielt", "Java how to programming", "pault_Dielt@gmail.com", 1067999191, 31236878));
        list.add(new author("Head Java", "Orcaly", "orcaly@icloud.com", 53573475, 9809079));
        list.add(new author("Jone", "Intoduction to java", "jone@icloud.com", 1232213, 6868578));
        list.add(new author("Ahmed Mourad", "Elephant Blue", "Ahmed_mourad@gmail.com", 1067985432, 213123323));
        list.add(new author("Ahmed Mourad", "Trab Elmase", "Ahmed_mourad@gmail.com", 1067985432, 213123323));
        list.add(new author("Yousef Zidan", "Azazil", "Youssef@icloud.com", 1199978191, 123123123));
        list.add(new author("Ahmed Khaled", "Shababeeb", "Ahmed_khalid@gmailcom", 1187999191, 12313));
        list.add(new author("Amir Monuir", "Eila Allah", "AmirMounir@gamil.com", 1164654362, 73545374));
        list.add(new author("Moustafa Houseny", "rehlat Elhaya", "MoutafaHousseny@gmail.com", 129493277, 21314124));

    }



    public void library() {
        AuthorList();
        System.out.println(list.size());

        int index;
        do {
            System.out.println("1.Add author book.");
            System.out.println("2.Add name book.");
            System.out.println("3.Add mail author book.");
            System.out.println("4.Add phone number.");
            System.out.println("5.Add Id book");
            System.out.println("6.Delete aurhor: ");
            System.out.println("7.Exit \n");

            System.out.print("Choice [1-6]>> \t");
            Scanner input = new Scanner(System.in);
            index = input.nextInt();

            if (index == 1) {
                String author;
                System.out.println("1.Add author boook.");
                System.out.println("Type author: ");
                input.nextLine();
                author = input.nextLine();
                list.add(new author(author));

                //  System.out.println(list.size());
            } else if (index == 2) {
                String book;
                System.out.println("2.Add name book.");
                System.out.println("Type name book: ");
                input.nextLine();
                book = input.nextLine();
                list.add(new author(book));
            } else if (index == 3) {
                System.out.println("3.Add mail author book.");
                System.out.println("Type mail author book: ");
                String mail;
                input.nextLine();
                mail = input.nextLine();
                list.add(new author(mail));

            } else if (index == 4) {
                System.out.println("4.Add phone number.");
                System.out.println("Type phone number: ");
                long televone;
                televone = input.nextLong();
                list.add(new author(televone));

            } else if (index == 5) {
                System.out.println("5.Add Id book");
                System.out.println("Type id book: ");
                String id;
                id = input.nextLine();
                list.add(new author(id));
                System.out.println(list.size());
            } else if (index == 6) {
                System.out.println("type id author you want delete: ");
                String st = input.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (st.equals(list.get(i).get_Author())) {
                        list.remove(i--);
                    }
                }

            }
            System.out.println(list.size());
            System.out.println(list.toString());
        } while (index != 7);


    }


    public void display() {
        AuthorList();
        Scanner input = new Scanner(System.in);
        System.out.println("Type Id author: ");
        int id = input.nextInt();
        for (int y =0;y<list.size();y++){
            if (id==list.get(y).get_Id()) {
                System.out.println("*************************************");
                System.err.println("اسم الكاتب " + list.get(y).get_NameBook());
                System.err.println("الهاتف " + list.get(y).get_Phone());
                System.err.println("البريد الكتروني " + list.get(y).get_Mail());
            }

        }
    }


//        public void print_author ( int id){
//
//            String n = "";
//
//            for (author author : list) {
//
//                if (author.get_Id() == id) {
//                    System.err.println("*****************************");
//                    System.err.println("  رقم التعريف  " + author.get_Id());
//                    System.err.println("اسم الكاتب " + author.get_NameBook());
//                    System.err.println("الهاتف " + author.get_Phone());
//                    System.err.println("البريد الكتروني " + author.get_Mail());
//
//                }
//
//            }
//        }



}






