

public class App {
    public static int Nel = 119;//Numero Elemento
    public static int NA[]= new int [Nel];//Numero Atomico
    public static String Si[] = new String [Nel];//
    public static String Ne[] = new String [Nel];//Nombre de Elemento
    public static double PE[] = new double [Nel];//Punto Ebullicion
    public static double PA[] = new double [Nel];//Peso Atomico
    public static double PF[] = new double [Nel];//Punto Fusion
    public static String VA[] = new String [Nel];//Valencia
    public static double DE[] = new double [Nel];//Densidad
    public static String EE[] = new String [Nel];//Estructura Electronica
    public static String GR[] = new String [Nel];//Grupo

    public static void GuardaRegistro(int na, String si, String ne, double pe,
                double pa, double pf, String va, double de, String ee, String gr){
    NA[na] = na;
    Si[na] = si;
    Ne[na] = ne;
    PE[na] = pe;
    PA[na] = pa;
    PF[na] = pf;
    VA[na] = va;
    DE[na] = de;
    EE[na] = ee;
    GR[na] = gr;
}//Fin del metodo GuardaRegistro

public static void Datos(){

    GuardaRegistro(1,"H", "Hidrógeno", -252.9, 1.008, -259.2, "-1", 0.00008988, "1s1", "Grupo 1");
    GuardaRegistro(2, "He", "Helio",-268.9, 4.0026, -272.2, "--",0.0001786,"1s2", "Grupo 18");
    GuardaRegistro(3, "Li", "Litio", 1342, 6.94, 180.5, "1", 0.534, "2s1", "Grupo 1");
    GuardaRegistro(4, "Be", "Berilio", 2469, 9.0122, 1287, "2", 1.848, "2s2",	"Grupo 2");
    GuardaRegistro(5, "B", "Boro", 3927, 10.81, 2076, "3", 2.34, "2s2 2p2", "Grupo 13");
    GuardaRegistro(6, "C", "Carbono", 4827, 12.011, 3550, "-4", 3.515, "2s2 2p2", "Grupo 14");
    GuardaRegistro(7, "N", "Nitrogeno", -195.8, 14.007, -210, "-3", 2.267, "2s2 2p3", "Grupo 15");
    GuardaRegistro(8, "O", "Oxigeno", -182.9, 15.999, -218.8, "-2", 0.0012506, "2s2 2p4", "Grupo 16");
    GuardaRegistro(9, "Z", "Fluor", -188.1, 18.998, -219.6, "-1", 0.001429, "2s2 2p5", "Grupo 17");
    GuardaRegistro(10, "Ne", "Neon", -246.1, 20.18, -248.6, "--", 0.001696, "2s2 2p6", "Grupo 18");
    GuardaRegistro(11, "Na", "Sodio", 883, 22.99, 97.8, "1", 0.0008999, "3s1", "Grupo 1");
    GuardaRegistro(12, "Mg", "Magnesio", 1090, 24.305, 650, "2", 0.971, "3s2", "Grupo 2");
    GuardaRegistro(13, "Al","Aluminio", 2519, 26.982, 660.3, "3", 1.738, "3s2 3p1", "Grupo 13");
    GuardaRegistro(14,"Si", "Silicio", 2900, 28.085, 1414, "4", 2.7, "3s2 3p2", "Grupo 14");
    GuardaRegistro(15, "P", "Fosforo", 280, 30.974, 44.1, "+3, +5", 2.329, "3s2 3p3", "Grupo 15");
    GuardaRegistro(16, "S", "Azufre", 444.6, 32.06, 115.2, "-2, +4, +6", 2.34, "3s2 3p4", "Grupo 16");
    GuardaRegistro(17, "Cl", "Cloro", -34.04, 35.45, -101.5, "-1, +1, +3, +5, +7", 2.067, "3s2 3p5", "Grupo 17");
    GuardaRegistro(18, "Ar", "Argon", -185.8, 39.948,  -189.4, "--", 0.003214, "3s2 3p6", "Grupo 18");
    GuardaRegistro(19, "K", "Potasio", 759, 39.098, 63.5, "1", 0.001784, "4s1", "Grupo 1");
    GuardaRegistro(20, "Ca", "Calcio", 1484, 40.078, 842, "2", 0.862, "4s2", "Grupo 2");
    GuardaRegistro(21, "Sc", "Escandio", 2831, 44.956, 1541, "3", 1.54, "3d1 4s2", "Grupo 3");
    GuardaRegistro(22, "Ti", "Titanio", 3287, 47.867, 1668, "4", 2.985, "3d2 4s2", "Grupo 4");
    GuardaRegistro(23, "V","Vanadio", 3407, 50.942, 1910, "+2, +3, +4, +5", 4.54, "3d3 4s2", "Grupo 5");
    GuardaRegistro(24, "Cr", "Cromo", 2672, 51.996, 1907, "+2, +3, +6", 6.11, "3d5 4s1", "Grupo 6");
    GuardaRegistro(25, "Mn", "Manganeso", 2061, 54.938, 1246, "+2, +3, +4, +6, +7", 7.19, "3d5 4s2", "Grupo 7");
    GuardaRegistro(26, "Fe", "Hierro", 2862, 55.845, 1538, "+2, +3", 7.43, "3d6 4s2", "Grupo 8");
    GuardaRegistro(27, "Co", "Cobalto", 2927, 58.933, 1495, "+2, +3", 7.874, "3d7 4s2", "Grupo 9");
    GuardaRegistro(28,"Ni", "Niquel", 2913, 58.693, 1455, "2", 8.9, "3d⁸ 4s²", "Grupo 10");
    GuardaRegistro(29, "Cu", "Cobre", 2562, 63.546, 1084.6, "+1, +2", 8.908, "3d10 4s1", "Grupo 11");
    GuardaRegistro(30, "Zn", "Zinc", 907, 65.38, 419.6, "2", 8.96, "3d10 4s2", "Grupo 12");
    GuardaRegistro(31, "Ga","Galio", 2403, 69.723, 29.8, "3", 7.14, "d10 4s2 4p1", "Grupo 13");
    GuardaRegistro(32, "Ge", "Germanio", 2833, 72.63, 938.3, "+2, +4", 5.91, "3d10 4s2 4p2", "Grupo 14");
    GuardaRegistro(33, "As", "Arsenico", 614, 74.922, 817, "+3, +5", 5.323, "3d10 4s2 4p3","Grupo 15");
    GuardaRegistro(34,"Se", "Selenio", 685, 78.971, 221, "-2, +4, +6", 5.776, "3d10 4s2 4p4","Grupo 16");
    GuardaRegistro(35, "Br", "Bromo", 59, 79.904, -7.2, "-1", 4.81, "3d10 4s2 4p5", "Grupo 17");
    GuardaRegistro(36, "Kr", "Kripton", -153.2, 83.798, -157.4, "--", 3.102, "3d10 4s2 4p6", "Grupo 18");
    GuardaRegistro(37, "Rb", "Rubidio", 688, 85.468, 39.3, "1", 0.003749, "5s1", "Grupo 1");
    GuardaRegistro(38, "Sr", "Estroncio", 1382, 87.62, 777, "2", 1.532, "5s2", "Grupo 2");
    GuardaRegistro(39, "Y", "Itrio", 3336, 88.906, 1526, "3", 2.64, "4d1 5s2", "Grupo 3");
    GuardaRegistro(40, "Zr", "Zirconio", 4409, 91.224, 1855, "4", 4.47, "4d2 5s2", "Grupo 4");
    GuardaRegistro(41, "Ni", "Niobio", 4744, 92.906, 2477, "+3, +5", 6.52, "4d4 5s1", "Grupo 5");
    GuardaRegistro(42,"Mb", "Molibdeno", 4639, 95.95, 2623, "+4, +6", 8.57, "4d5 5s1", "Grupo 6");
    GuardaRegistro(43, "Tc", "Tecnecio", 4265, -98, 2157, "+2, +3, +4, +6", 10.28, "4d5 5s2", "Grupo 7");
    GuardaRegistro(44, "Ru",  "Rutenio", 4150, 101.07, 2334, "3", 11.5, "4d7 5s1", "Grupo 8");
    GuardaRegistro(45, "Rh", "Rodio", 3695, 102.91, 1964, "+2, +4", 12.37, "4d8 5s1", "Grupo 9");
    GuardaRegistro(46, "Pd", "Paladio", 2963, 106.42, 1554.9, "1", 12.41, "4d10", "Grupo 10");
    GuardaRegistro(47, "Ag", "Plata", 2162, 107.87, 961.8, "2", 12.02, "4d10 5s1", "Grupo 11");
    GuardaRegistro(48, "Cd", "Cadmio", 767, 112.41, 321.1, "3", 10.49, "4d10 5s2", "Grupo 12");
    GuardaRegistro(49, "In", "Indio", 2072, 114.82, 156.6, "+2, +4", 8.65, "4d10 5s2 5p1","Grupo 13");
    GuardaRegistro(50, "Sn", "Estaño", 2602, 114.82, 231.9, "+3, +5", 7.31, "4d10 5s2 5p2", "Grupo 14");
    GuardaRegistro(51, "Sb", "Antimonio", 1587, 121.76, 630.6, "-2, +4, +6", 7.31, "4d10 5s2 5p3", "Grupo 15");
    GuardaRegistro(52,"Te", "Telurio", 988, 127.6, 449.5, "-1, +1, +3, +5, +7", 6.697, "4d10 5s2 5p4", "Grupo 16");
    GuardaRegistro(53, "I","Yodo", 184.3, 126.9, 113.7, "0, +2, +4, +6", 6.24, "4d10 5s2 5p5", "Grupo 17");
    GuardaRegistro(54, "Xe", "Xenon", -108.1, 131.29, -111.8, "1", 4.933, "4d10 5s2 5p6", "Grupo 18");
    GuardaRegistro(55, "Cs", "Cesio", 671, 132.91, 28.4 , "2", 0.005887, "6s¹", "Grupo 1");
    GuardaRegistro(56, "Ba", "Bario", 1560, 137.33, 727, "3", 1.873, "6s2", "Grupo 2");
    GuardaRegistro(57, "La", "Lantano", 3464, 138.91, 920, "+3, +4", 3.62, "5d1 6s2", "Grupo 3");
    GuardaRegistro(58, "Ce", "Cerio", 3360, 140.12, 931, "3", 6.15, "4f1 5d1 6s2", "Grupo 3");
    GuardaRegistro(59, "Pr", "Praseodimio", 3290, 140.91, 1024, "3", 6.77, "4f2 5d1 6s2","Grupo 3");
    GuardaRegistro(60, "Nd", "Neodimio", 3074, 144.24, 1042, "3", 6.77, "4f3 6s2", "Grupo 3");
    GuardaRegistro(61, "Pr", "Prometio", 3000, -145, 1072, "3", 7, "4f4 6s2", "Grupo 3");
    GuardaRegistro(62, "Sm", "Samario", 1794, 150.36, 826, "+2, +3", 7.26, "4f5 6s2", "Grupo 3");
    GuardaRegistro(63, "Eu", "Europio", 1529, 151.96, 1312, "3", 7.52, "4f7 6s2","Grupo 3");
    GuardaRegistro(64, "Gd", "Gadolinio", 3273, 157.25, 1356, "3", 5.243, "4f7 5d1 6s2", "Grupo 3");
    GuardaRegistro(65, "Tb", "Terbio", 3230, 158.93, 1412, "3", 7.9, "4f8 6s2", "Grupo 3");
    GuardaRegistro(66, "Dy", "Disprosio", 2567, 162.5, 1474, "3", 8.23, "4f10 6s2", "Grupo 3");
    GuardaRegistro(67, "Ho", "Holmio", 2700, 164.93, 1497, "3", 8.55, "4f11 6s2", "Grupo 3");
    GuardaRegistro(68, "Er", "Erbio", 2868, 167.26, 1545, "3", 8.79, "4f12 6s2", "Grupo 3");
    GuardaRegistro(69, "Tm", "Tulio", 1950, 168.93, 824, "3", 9.07, "4f13 6s2", "Grupo 3");
    GuardaRegistro(70, "Yb", "Iterbio", 1196, 173.05, 1652, "3", 9.32, "4f14 6s2",  "Grupo 3"); 
    GuardaRegistro(71, "Lu", "Lutecio", 3395, 174.97, 2233, "4", 6.57, "4f14 5d1 6s2", "Grupo 3");
    GuardaRegistro(72,"Hf", "Hafnio", 4602, 178.49, 3017, "5", 9.84, "4f14 5d2 6s2","Grupo 4");
    GuardaRegistro(73, "Ta", "Tantalio", 5458, 180.95, 3422, "6", 13.31, "4f14 5d3 6s2", "Grupo 5");
    GuardaRegistro(74, "W", "Wolframio", 5555, 183.84, 3186, "7", 16.65, "4f14 5d4 6s2", "Grupo 6");
    GuardaRegistro(75,"Re", "Renio", 5869, 186.21, 3033, "+4, +6", 19.25, "4f14 5d5 6s2", "Grupo 7");
    GuardaRegistro(76, "Os", "Osmio", 5012, 190.23, 2466, "+3, +4", 21.02, "4f14 5d6 6s2", "Grupo 8" );
    GuardaRegistro(77, "Ir", "Iridio", 4428, 192.22, 1768.3, "+2, +4", 22.59, "4f14 5d7 6s2", "Grupo 9");
    GuardaRegistro(78, "Pt", "Platino", 3827, 195.08, 1064, "+1, +3", 22.56, "4f14 5d3 6s2", "Grupo 10");
    GuardaRegistro(79, "Au", "Oro", 2856, 196.97, -38.83, "+1, +2", 21.45, "4f14 5d10 6s1", "Grupo 11");
    GuardaRegistro(80, "Hg", "Mercurio", 356.7, 200.59, 304, "+1, +3", 19.32, "4f14 5d10 6s2", "Grupo 12");
    GuardaRegistro(81,"Tl",	"Talio", 1473, 204.38, 327.5, "+2, +4", 13.534, "4f14 5d10 6s2 6p1", "Grupo 13");
    GuardaRegistro(82, "Pb", "Plomo", 1749, 207.2, 271.4, "+3, +5", 11.85, "4f14 5d10 6s2 6p2", "Grupo 14");
    GuardaRegistro(83, "Bi", "Bismuto", 1564, 208.98, 254, "+2, +4", 11.34, "4f14 5d10 6s2 6p3", "Grupo 15");
    GuardaRegistro(84, "Po",	"Polonio", 962, 209, ~302, "+1, +3, +5, +7", 9.78, "4f14 5d10 6s2 6p4","Grupo 16");
    GuardaRegistro(85,"At", "Astato", -337, 210, -71, "--", 9.32, "4f14 5d10 6s2 6p5", "Grupo 17");
    GuardaRegistro(86, "Rn", "Radon", -61.7, 222, ~27, "1", 6.95, "4f14 5d10 6s2 6p6", "Grupo 18");
    GuardaRegistro(87, "Fr", "Francio", ~677, 223, 700, "2", 0.00973, "7s1", "Grupo 1");
    GuardaRegistro(88,"Ra", "Radio", 1413, 226, 1050, "3", 1.87, "7s2", "Grupo 2");
    GuardaRegistro(89, "Ac", "Actinio", 3200, 227, 1750, "4", 5.5, "6d1 7s2","Grupo 3");
    GuardaRegistro(90, "Th", "Torio", 4788, 232.04, 1572, "4", 10.07, "5f1 6d2 7s2", "Grupo 3");
    GuardaRegistro(91, "Pa", "Proactinio", 4027, 231.04, 1132.3, "+3, +4, +6", 11.72, "5f2 6d1 7s2", "Grupo 3");
    GuardaRegistro(92, "U", "Uranio", 4131, 238.03, 639, "+3, +4, +5, +6", 15.37, "6d1 7s2", "Grupo 3");
    GuardaRegistro(93, "Np", "Neptunio", 3902, 237, 639.4, "+3, +4, +5, +6", 18.95, "5f4 6d1 7s2", "Grupo 3");
    GuardaRegistro(94, "Pu", "Plutonio", 3235, 244, 1176, "+3, +4", 20.45, "5f6 7s2", "Grupo 3");
    GuardaRegistro(95, "Am", "Americio", 2607, 243, 1340, "3", 19.86, "f7 7s2", "Grupo 3");
    GuardaRegistro(96, "Cm","Curio", 3110, 247, 986, "3",  13.67, "6d1 7s2", "Grupo 3");
    GuardaRegistro(97,  "Bk", "Berkelio", 2900, 247, 900, "3", 13.5, "5f9 7s2", "Grupo 3");
    GuardaRegistro(98, "Cf", "Californio", 1743, 251, ~860, "3", 14.78, "5f10 7s2", "Grupo 3");
    GuardaRegistro(99, "Es", "Einstenio", 1269, 252, ~1527, "3", 15.1, "5f11 7s2","Grupo 3");
    GuardaRegistro(100, "Fm", "Fermio", ~1527, 257,0 , "3", 8.79, "5f12 7s2", "Grupo 3");
    GuardaRegistro(101, "Md", "Mendelevio", 0, 258, ~827, "3", 9.7, "5f13 7s2", "Grupo 3");
    GuardaRegistro(102,"No","Nobelio", 0, 259, ~1627, "3", 10.3, "5f14 7s2", "Grupo 3");
    GuardaRegistro(103,"Lr", "Laurencio", ~1627, 262, 0, "4", 9.7, "5f14 6d1 7s2", "Grupo 3");
    GuardaRegistro(104,"Rf", "Rutherfordio", 0, 267,	0, "5", 10.07, "5f14 6d2 7s2", "Grupo 4");
    GuardaRegistro(105, "Db", "Dubnio", 0, 270, 0, "6", 17, "5f14 6d3 7s2", "Grupo 5");
    GuardaRegistro(106,"Sg", "Seaborgio", 0, 271, 0, "7", 29.3, "5f14 6d4 7s2", "Grupo 6");
    GuardaRegistro(107, "Bh", "Bohrio", 0, 270, 0, "8", 35, "5f14 6d5 7s2", "Grupo 7");
    GuardaRegistro(108,"Hs", "Hasio", 0, 277, 0, "6", 37, "5f14 6d6 7s2","Grupo 8");
    GuardaRegistro(109, "Mt", "Meitnerio", 0, 276, 0, "10", 40, "5f14 6d7 7s2", "Grupo 9");
    GuardaRegistro(110,"Ds", "Darmstatio", 0, 281, 0, "6", 38, "5f14 6d8 7s2", "Grupo 10");
    GuardaRegistro(111,"Rg", "Roentgenio", 0, 282, ~-283, "2", 34, "5f14 6d9 7s2", "Grupo 11");
    GuardaRegistro(112,"Cn", "Copernicio", ~84, 285, 0, "+1, +3", 28, "5f14 6d10 7s2", "Grupo 12");
    GuardaRegistro(113,"Nh", "Nihomio",0, 286, ~70, "2", 23, "5f¹⁴ 6d¹⁰ 7s² 7p¹", "Grupo 13");
    GuardaRegistro(114, "Fl", "Flerovio", ~-60, 289, 0, "+1, +3", 13, "5f14 6d10 7s2 7p3", "Grupo 14");
    GuardaRegistro(115,"Mc", "Moscovio", 0, 290, ~-10, "2", 14, "5f14 6d10 7s2 7p3","Grupo 15");
    GuardaRegistro(116,"Lv", "Livermorio", ~-30, 293, 0, "+1, +3", 3, "5f¹⁴ 6d¹⁰ 7s² 7p⁴","Grupo 16");
    GuardaRegistro(117,"Ts", "Teneso",0, 294, 0, "--", 12,"5f14 6d10 7s2 7p5", "Grupo 17");
    GuardaRegistro(118, "Og", "Oganeson",0 , 294,0 ,"--", 9, "5f14 6d10 7s2 7p6", "Grupo 18");

}

public static void ImprimeRegistro(int i){
    String f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f;
    f1 = "%-4d"; f2 ="%-5s"; f3 ="%-13s"; f4 ="%-7.1f"; f5 ="%-7.4f"; f6 ="%-7.1f";  f7 ="%-3s"; f8 ="%-7.3f"; f9 ="%-21s"; f10 ="%-7s";
    f = f1+f2+f3+f4+f5+f6+f7+f8+f9+f10+"\n";
    System.out.format(f, NA[i], Si[i], Ne[i], PE[i], PA[i], PF[i], VA[i], DE[i], EE[i], GR[i]);

}//Fin del metodo ImprimeRegistro

public static void ImprimeTabla(){
    System.out.println("NA  Si     Ne           PE    PA     PF    VA   DE     EE                   GR");
    System.out.println("=================================================================================");
    for(int k = 1; k<=118; k++){
        ImprimeRegistro(k);
        }//Fin del ciclo k
    System.out.println("=================================================================================");
}//Fin del metodo ImprimeTabla

public static void SwapNA(int k){

    int te=0;

    te = NA[k];
    NA[k] = NA[k+1];
    NA[k+1] = te;

}//Fin del metodo SwapNA

public static void SwapSi(int k){

    String ts = "";

    ts = Si[k];
    Si[k] = Si[k+1];
    Si[k+1] = ts;

}//Fin del metodo SwapSI

public static void SwapNe(int k){

    String ts = "";

    ts = Ne[k];
    Ne[k] = Ne[k+1];
    Ne[k+1] = ts;

    }//Fin del metodo SwapNe

    public static void SwapPE(int k){

        double td;
    
        td = PE[k];
        PE[k] = PE[k+1];
        PE[k+1] = td;

}//Fin del metodo SwapPE

public static void SwapPA(int k){

    double td;

    td = PA[k];
    PA[k] = PA[k+1];
    PA[k+1] = td;

}//Fin del metodo SwapPA

public static void SwapPF(int k){

    double td;

    td = PF[k];
    PF[k] = PF[k+1];
    PF[k+1] = td;

}//Fin del metodo SwapPF

public static void SwapVA(int k){

    String ts = "";

    ts = VA[k];
    VA[k] = VA[k+1];
    VA[k+1]= ts;

}//Fin del metodo SwapVA

public static void SwapDE(int k){

    double td;

    td = DE[k];
    DE[k] = DE[k+1];
    DE[k+1] = td;

}//Fin del metodo SwapDE

public static void SwapGR(int k){

    String ts = "";

    ts = GR[k];
    GR[k] = GR[k+1];
    GR[k+1]= ts;

}//Fin del metodo SwapGR

public static void SwapEE(int k){

    String ts = "";

    ts = EE[k];
    EE[k] = EE[k+1];
    EE[k+1]= ts;

}//Fin del metodo SwapEE

public static void Swap(int k){

    double td; String ts = ""; int te=0;
    SwapNA(k);
    SwapSi(k);
    SwapNe(k);
    SwapPE(k);
    SwapPA(k);
    SwapPF(k);
    SwapVA(k);
    SwapDE(k);
    SwapGR(k);
    SwapEE(k);

}//Fin del metodo Swap

public static void OrdAscxPE(){
    int n = PE.length;
    for(int v = 1; v<=n-1; v++){
        for(int k = 0; k<=n-2; k++){
            if(PE[k+1]<PE[k]){
                Swap(k);
            }//Fin del if
        }//Fin del ciclo k
      }//Fin del ciclo v
     }//Fin del metodo OrdAscxPe

public static void main(String[] args) {
    Datos();
    OrdAscxPE();
    ImprimeTabla();

    }//Fin del metodo main

}//Fin de la clase TP
