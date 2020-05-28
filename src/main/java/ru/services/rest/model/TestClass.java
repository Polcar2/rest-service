package ru.services.rest.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestClass {

    private String stroka1;

    private String stroka2;

    private String stroka3;

    private List<String> stroki;

    public TestClass(){

    }


    public TestClass(String stroka1, String stroka2, String stroka3, List<String> stroki){
      this.stroka1 = stroka1;
      this.stroka2 = stroka2;
      this.stroka3 = stroka3;

      this.stroki = new ArrayList<>();

    }

    public String getStroka1() {
        return stroka1;
    }

    public void setStroka1(String stroka1) {
        this.stroka1 = stroka1;
    }

    public String getStroka2() {
        return stroka2;
    }

    public void setStroka2(String stroka2) {
        this.stroka2 = stroka2;
    }

    public String getStroka3() {
        return stroka3;
    }

    public void setStroka3(String stroka3) {
        this.stroka3 = stroka3;
    }

    public List<String> getStroki() {
        return stroki;
    }

    public void setStroki(List<String> stroki) {
        this.stroki = stroki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return Objects.equals(stroka1, testClass.stroka1) &&
                Objects.equals(stroka2, testClass.stroka2) &&
                Objects.equals(stroka3, testClass.stroka3) &&
                Objects.equals(stroki, testClass.stroki);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stroka1, stroka2, stroka3, stroki);
    }
}
