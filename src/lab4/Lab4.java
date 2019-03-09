package lab4;

public class Lab4 {
    public static void main(String[] arg){
        Mebel Shkaf = new Mebel(2.4, 6, 0.8, "Дерево", "Шкаф");
        Mebel Stol = new Mebel(1, 2.2, 0.7, "Дерево", "Стол");
        Mebel Stul = new Mebel(1.8, 0.7, 0.6, "Дерево", "Стул");
        Mebel Kamod = new Mebel(1.2, 1.2, 0.7, "Дерево", "Камод");
        Mebel Divan = new Mebel(1.1, 3, 1.5, "Дерево", "Диван");
        Object[][] Height = new Object[][]{{Shkaf.height,Stol.height,Stul.height,Kamod.height,Divan.height},{Shkaf.name,Stol.name,Stul.name,Kamod.name,Divan.name}};
        Object[][] Weight = new Object[][]{{Shkaf.width,Stol.width,Stul.width,Kamod.width,Divan.width},{Shkaf.name,Stol.name,Stul.name,Kamod.name,Divan.name}};
        for (int i = 0; i < Height[0].length; i++) {
            Object min = Height[0][i];
            int min_i = i;
            for (int j = i+1; j < Height[0].length; j++) {
                if ((double)Height[0][j] < (double)min) {
                    min = Height[0][j];
                    min_i = j;

                }
            }
            if (i != min_i) {
                Object tmp = Height[0][i];
                Object tmpp = Height[1][i];
                Height[0][i] = Height[0][min_i];
                Height[1][i] = Height[1][min_i];
                Height[0][min_i] = tmp;
                Height[1][min_i] = tmpp;
            }
        }


        for (int i = 0; i < Weight[0].length; i++) {
            Object min = Weight[0][i];
            int min_i = i;
            for (int j = i+1; j < Weight[0].length; j++) {
                if ((double)Weight[0][j] < (double)min) {
                    min = Weight[0][j];
                    min_i = j;

                }
            }
            if (i != min_i) {
                Object tmp = Weight[0][i];
                Object tmpp = Weight[1][i];
                Weight[0][i] = Weight[0][min_i];
                Weight[1][i] = Weight[1][min_i];
                Weight[0][min_i] = tmp;
                Weight[1][min_i] = tmpp;
            }
        }
        System.out.println("Сортировка за высотой:");
        for (int f=Height[0].length-1;f>=0;f--){
            System.out.println(Height[1][f]+" = "+Height[0][f]);
        }
        System.out.println();
        System.out.println("Сортировка за шириной:");
        for (int f=Weight[0].length-1;f>=0;f--){
            System.out.println(Weight[1][f]+" = "+Weight[0][f]);
        }
    }
}



