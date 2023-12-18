public class Main {
    public static void main(String[] args) {
        //tao 5 programing book
        ProgrammingBook programmingBook1 = new ProgrammingBook();
        ProgrammingBook programmingBook2 = new ProgrammingBook();
        ProgrammingBook programmingBook3 = new ProgrammingBook();
        ProgrammingBook programmingBook4 = new ProgrammingBook();
        ProgrammingBook programmingBook5 = new ProgrammingBook();
        // tao 5 fiction book
        FictionBook fictionBook1 = new FictionBook();
        FictionBook fictionBook2 = new FictionBook();
        FictionBook fictionBook3 = new FictionBook();
        FictionBook fictionBook4 = new FictionBook();
        FictionBook fictionBook5 = new FictionBook();

        //tao gia cho 10 quyen sach moi khoi tao tren
        programmingBook1.setPrice(10);
        programmingBook2.setPrice(12);
        programmingBook3.setPrice(13);
        programmingBook4.setPrice(15);
        programmingBook5.setPrice(18);
        fictionBook1.setPrice(21);
        fictionBook2.setPrice(23);
        fictionBook3.setPrice(24);
        fictionBook4.setPrice(26);
        fictionBook5.setPrice(29);
        //tao language cho programingbook
        programmingBook1.setLanguage("PHP");
        programmingBook2.setLanguage("C language");
        programmingBook3.setLanguage("Java");
        programmingBook4.setLanguage("C#");
        programmingBook5.setLanguage("Python");
        //tao category cho FictionBook
        fictionBook1.setCategory("Vien tuong 1");
        fictionBook2.setCategory("Vien tuong 2");
        fictionBook3.setCategory("Vien tuong 3");
        fictionBook4.setCategory("Vien tuong 4");
        fictionBook5.setCategory("Vien tuong 5");


        double sumOfPrice = programmingBook1.price + programmingBook2.price + programmingBook3.price + programmingBook4.price + programmingBook5.price+
                            fictionBook1.price + fictionBook2.price + fictionBook3.price + fictionBook4.price + fictionBook5.price;
        System.out.println("Total price of 10 books: "+ sumOfPrice + "$");
        //dem so sach co language Java
        int coutProgrammingBook = 0;
        if(programmingBook1.language.equals("Java"))coutProgrammingBook++;
        if(programmingBook2.language.equals("Java"))coutProgrammingBook++;
        if(programmingBook3.language.equals("Java"))coutProgrammingBook++;
        if(programmingBook4.language.equals("Java"))coutProgrammingBook++;
        if(programmingBook5.language.equals("Java"))coutProgrammingBook++;
        System.out.println("Quality of book's language Java is:  \n"+ coutProgrammingBook);
        //dem so sach co category la vien tuong 1
        int countFictionBook = 0;
        if (fictionBook1.category.equals("Viễn tưởng 1"))countFictionBook++;
        if (fictionBook2.category.equals("Viễn tưởng 1"))countFictionBook++;
        if (fictionBook3.category.equals("Viễn tưởng 1"))countFictionBook++;
        if (fictionBook4.category.equals("Viễn tưởng 1"))countFictionBook++;
        if (fictionBook5.category.equals("Viễn tưởng 1"))countFictionBook++;
        System.out.println("Quality of book's category Viễn Tưởng 1 is: \n"+ countFictionBook);
        //dem sach co gia <100
        int countPrice = 0;
        if (fictionBook1.price < 100)countPrice++;
        if (fictionBook2.price < 100)countPrice++;
        if (fictionBook3.price < 100)countPrice++;
        if (fictionBook4.price < 100)countPrice++;
        if (fictionBook5.price < 100)countPrice++;
        System.out.println("Quality of Book fiction have prive under 100$: "+countPrice);
    }
}