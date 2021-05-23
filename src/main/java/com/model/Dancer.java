package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "dancersdata")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Dancer {

    @Id
    @Column(name = "code")
    private Integer code;

    @Column(name = "sex")
    private String sex;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "ratingd")
    private String ratingd;

    @Column(name = "bg")
    private Integer bg;

    @Column(name = "rs")
    private Integer rs;

    @Column(name = "m")
    private Integer m;

    @Column(name = "s")
    private Integer s;

    @Column(name = "ch")
    private Integer ch;

    @Column(name = "resd")
    private Integer resd;

    @Column(name = "club")
    private String club;

    @Column(name = "ratingc")
    private String ratingc;

    @Column(name = "e")
    private Integer e;

    @Column(name = "d")
    private Integer d;

    @Column(name = "c")
    private Integer c;

    @Column(name = "b")
    private Integer b;

    @Column(name = "a")
    private Integer a;

    @Column(name = "resc")
    private Integer resc;
}