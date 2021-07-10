package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="films")
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "adString")
	private String adString;
	@Column(name = "yayinYili")
	private Integer yayinYili;
	@Column(name = "turString")
	private String turString;
	@Column(name = "aciklamaString")
	private String aciklamaString;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdString() {
		return adString;
	}
	public void setAdString(String adString) {
		this.adString = adString;
	}
	public Integer getYayinYili() {
		return yayinYili;
	}
	public void setYayinYili(Integer yayinYili) {
		this.yayinYili = yayinYili;
	}
	public String getTurString() {
		return turString;
	}
	public void setTurString(String turString) {
		this.turString = turString;
	}
	public String getAciklamaString() {
		return aciklamaString;
	}
	public void setAciklamaString(String aciklamaString) {
		this.aciklamaString = aciklamaString;
	}

}
