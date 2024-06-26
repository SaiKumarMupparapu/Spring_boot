package com.Examole.demo.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long psId;
	private String pasNum;
	private LocalDate issuedDate ;
	private LocalDate expyDate ;
	@OneToOne
	@JoinColumn(name="pid")
	private PersonPs p;
	
	public Long getPsId() {
		return psId;
	}

	public void setPsId(Long psId) {
		this.psId = psId;
	}

	public String getPasNum() {
		return pasNum;
	}

	public void setPasNum(String pasNum) {
		this.pasNum = pasNum;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDate getExpyDate() {
		return expyDate;
	}

	public void setExpyDate(LocalDate expyDate) {
		this.expyDate = expyDate;
	}

	public PersonPs getP() {
		return p;
	}

	public void setP(PersonPs p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Passport [psId=" + psId + ", pasNum=" + pasNum + ", issuedDate=" + issuedDate + ", expyDate=" + expyDate
				+ ", p=" + p + "]";
	}

	
	
}
