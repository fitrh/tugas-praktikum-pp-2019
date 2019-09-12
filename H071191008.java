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
