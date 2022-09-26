package aula02;

public class Pessoa {
    String name;
    int age;
    String ID;
    int weight;
    int height;

    public Pessoa() {}

    public Pessoa(String name, int age, String ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public Pessoa(String name, int age, String ID, int weight, int height) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.weight = weight;
        this.height = height;
    }

    public double calcularIMC(int weight, int height) {
        int calculo = weight / (height * height);
        if(calculo < 20) {
            return -1;
        } else if (calculo <= 20 || calculo <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade(int age) {
        if(age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return name, age, ID, weight, height
    }
}
