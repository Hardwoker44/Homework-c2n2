public class Hogwarts {
    private int powerOfMagic;
    private int distanceOfTransgression;
    private String name;
    private String surname;
    private String faculty;

    public Hogwarts(String name, String surname, int powerOfMagic, int distanceOfTransgression, String faculty) {
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        if (powerOfMagic > 0 && powerOfMagic <= 100) {
            this.powerOfMagic = powerOfMagic;
        }
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        if (distanceOfTransgression > 0 && distanceOfTransgression <= 100){
            this.distanceOfTransgression = distanceOfTransgression;
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + powerOfMagic + " " + distanceOfTransgression + " " + faculty;
    }
}
class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int powerOfMagic, int distanceOfTransgression, String faculty, int nobility, int honor, int courage) {
        super(name, surname, powerOfMagic, distanceOfTransgression, faculty);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
    public void setNobility(int nobility) {
        if (nobility > 0 && nobility <= 100){
            this.nobility = nobility;
        }
    }
    public void setHonor(int honor) {
        if (honor > 0 && honor <= 100){
            this.honor = honor;
        }
    }
    public void setCourage(int courage) {
        if (courage > 0 && courage <= 100){
            this.courage = courage;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ": " + nobility + " " + honor + " " + courage;
    }
}
class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, String surname, int powerOfMagic, int distanceOfTransgression, String faculty, int smart, int wise, int witty, int creativity) {
        super(name, surname, powerOfMagic, distanceOfTransgression, faculty);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setSmart(int smart) {
        if (smart > 0 && smart <= 100){
            this.smart = smart;
        }
    }

    public void setWise(int wise) {
        if (wise > 0 && wise <= 100){
            this.wise = wise;
        }
    }

    public void setWitty(int witty) {
        if (witty > 0 && witty <= 100){
            this.witty = witty;
        }
    }

    public void setCreativity(int creativity) {
        if (creativity > 0 && creativity <= 100){
            this.creativity = creativity;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ": " + smart + " " + wise + " " + witty + " " + creativity;
    }
}
class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, String surname, int powerOfMagic, int distanceOfTransgression, String faculty, int hardworking, int loyalty, int honest) {
        super(name, surname, powerOfMagic, distanceOfTransgression, faculty);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHardworking(int hardworking) {
        if (hardworking > 0 && hardworking <= 100){
            this.hardworking = hardworking;
        }
    }

    public void setLoyalty(int loyalty) {
        if (loyalty > 0 && loyalty <= 100){
            this.loyalty = loyalty;
        }
    }

    public void setHonest(int honest) {
        if (honest > 0 && honest <= 100){
            this.honest = honest;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ": " + hardworking + " " + loyalty + " " + honest;
    }
}
class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambitiousness;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int distanceOfTransgression, String faculty, int cunning, int determination, int ambitiousness, int resourcefulness, int thirstForPower) {
        super(name, surname, powerOfMagic, distanceOfTransgression, faculty);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        if (cunning > 0 && cunning <= 100){
            this.cunning = cunning;
        }
    }

    public void setDetermination(int determination) {
        if (determination > 0 && determination <= 100){
            this.determination = determination;
        }
    }

    public void setAmbitiousness(int ambitiousness) {
        if (ambitiousness > 0 && ambitiousness <= 100){
            this.ambitiousness = ambitiousness;
        }
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness > 0 && resourcefulness <= 100){
            this.resourcefulness = resourcefulness;
        }
    }

    public void setThirstForPower(int thirstForPower) {
        if (thirstForPower > 0 && thirstForPower <= 100){
            this.thirstForPower = thirstForPower;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ": " + cunning + " " + determination + " " + ambitiousness + " " + resourcefulness + " " + thirstForPower;
    }
}