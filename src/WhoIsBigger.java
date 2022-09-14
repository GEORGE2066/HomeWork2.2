public class WhoIsBigger {
    public static String WhoIsBiggerGriff(Griffindor a, Griffindor b) {
        if (a.getSum() > b.getSum()) {
            return "Лучше " + a.getName();
        } else if(a.getSum() < b.getSum()) {
            return "Лучше " + b.getName();
        } else {
            return "Они равны";
        }
    }

    public static String WhoIsBiggerPuff(Puffenduy a, Puffenduy b) {
        if (a.getSum() > b.getSum()) {
            return "Лучше " + a.getName();
        } else if(a.getSum() < b.getSum()) {
            return "Лучше " + b.getName();
        } else {
            return "Они равны";
        }
    }

    public static String WhoIsBiggerCokte(Coktevran a, Coktevran b) {
        if (a.getSum() > b.getSum()) {
            return "Лучше " + a.getName();
        } else if(a.getSum() < b.getSum()) {
            return "Лучше " + b.getName();
        } else {
            return "Они равны";
        }
    }

    public static String WhoIsBiggerSlith(Slitherin a, Slitherin b) {
        if (a.getSum() > b.getSum()) {
            return "Лучше " + a.getName();
        } else if(a.getSum() < b.getSum()) {
            return "Лучше " + b.getName();
        } else {
            return "Они равны";
        }
    }
}
