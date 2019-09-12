// Fachrizal Taufiq Goe | H071191008

public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int waktu,kecepatan;
    float hasil;

    waktu = input.nextInt();
    kecepatan = input.nextInt();
    hasil = (float)waktu * kecepatan / 14;
    System.out.printf("Bensin Yang Digunakan : %.3f ",hasil);
}

public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int detik,menit,jam;

        detik = input.nextInt();
        menit = detik/60;
        jam = menit/60;

        menit %= 60;
        detik %= 60;
        System.out.printf("%02d:%02d:%02d\n",jam,menit,detik);
}

public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double a,h,u,b,x,y;
        h = input.nextDouble();
        a = input.nextDouble();
        b = input.nextDouble();
        y = Math.tan(Math.toRadians(b)) * h;
        u = Math.tan(Math.toRadians(a)) * h;
        x = u - y;
        System.out.printf("%.1f",x);
}

// Fachrizal Taufiq Goe | H071191008
