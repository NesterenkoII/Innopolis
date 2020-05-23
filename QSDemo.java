class QuicSort {
    static void qSort (char items[]) {
        qs (items, 0, items.length-1);
    }

    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;
        String str = "Все будет хорошо";

        i = left; j = right;
        x = items[(left + right)/2];

        System.out.println("x: " + x);
        do {
            while ((items[i] < x) && (i < right)) i++;
            System.out.println("i: " + i);
            while ((x < items[j]) && (j > left)) j--;
            System.out.println("j: " + j);

            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while (i <= j);

        if (left < j) qs(items, left, j);
        if (i < right) qs(items,i, right);
    }
}

class QSDemo {
    public static void main (String[] args) {
        char[] arrCh = {'a', 'b', 'd', 'e', 'c', 'f', 'g'};

        System.out.println("arrCh.length: " + arrCh.length);

        System.out.print("arrCh befor sort: ");
        for(char i: arrCh) System.out.print(i + " ");
        System.out.println();

        QuicSort.qSort(arrCh);
        System.out.println();
        System.out.print("arrCh after sort: ");
        for(char i: arrCh) System.out.print(i + " ");
        System.out.println();
    }
}

class circle extends TwoDShape {
    private double R;
    private double Pi = 3.14,

    circle (double x) {
        super ("круг", x);
        R = x;
    }

    double area() {
        return Pi*R*R;
    }
}