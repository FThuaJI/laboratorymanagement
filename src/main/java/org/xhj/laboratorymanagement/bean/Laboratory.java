package org.xhj.laboratorymanagement.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Laboratory{

    @Id
    @GeneratedValue
    private Integer id;
    private String laboratory_name;
    private String laboratory_build;
    private String laboratory_num;
    private Integer laboratory_capacity;
    private String laboratory_use;
    private String laboratory_describe;
    @OneToMany(mappedBy = "laboratory")
    private List<Comment> comments = new ArrayList<>();

    public Laboratory() {
    }

    public Laboratory(Integer laboratory_id, String laboratory_name, String laboratory_build, String laboratory_num,
                      Integer laboratory_capacity, String laboratory_use, String laboratory_describe) {
        this.laboratory_name = laboratory_name;
        this.laboratory_build = laboratory_build;
        this.laboratory_num = laboratory_num;
        this.laboratory_capacity = laboratory_capacity;
        this.laboratory_use = laboratory_use;
        this.laboratory_describe = laboratory_describe;
    }

    public String getLaboratory_name() {
        return laboratory_name;
    }

    public void setLaboratory_name(String laboratory_name) {
        this.laboratory_name = laboratory_name;
    }

    public String getLaboratory_build() {
        return laboratory_build;
    }

    public void setLaboratory_build(String laboratory_build) {
        this.laboratory_build = laboratory_build;
    }

    public String getLaboratory_num() {
        return laboratory_num;
    }

    public void setLaboratory_num(String laboratory_num) {
        this.laboratory_num = laboratory_num;
    }

    public Integer getLaboratory_capacity() {
        return laboratory_capacity;
    }

    public void setLaboratory_capacity(Integer laboratory_capacity) {
        this.laboratory_capacity = laboratory_capacity;
    }

    public String getLaboratory_use() {
        return laboratory_use;
    }

    public void setLaboratory_use(String laboratory_use) {
        this.laboratory_use = laboratory_use;
    }

    public String getLaboratory_describe() {
        return laboratory_describe;
    }

    public void setLaboratory_describe(String laboratory_describe) {
        this.laboratory_describe = laboratory_describe;
    }

    @Override
    public String toString() {
        return "Laboratory{" +
                ", laboratory_name='" + laboratory_name + '\'' +
                ", laboratory_build='" + laboratory_build + '\'' +
                ", laboratory_num='" + laboratory_num + '\'' +
                ", laboratory_capacity=" + laboratory_capacity +
                ", laboratory_use='" + laboratory_use + '\'' +
                ", laboratory_describe='" + laboratory_describe + '\'' +
                '}';
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
