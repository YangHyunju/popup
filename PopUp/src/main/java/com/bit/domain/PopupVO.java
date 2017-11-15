package com.bit.domain;

import java.util.Date;

public class PopupVO {

	public PopupVO() {
		// TODO Auto-generated constructor stub
	}

	private int pop_id;
	private int kind_id;
	private int user_id;
	private String pop_title;
	private String pop_content;
	private String pop_open;
	private Date pop_create_dtm;
	private Date pop_update_dtm;
	private Date pop_start_dte;
	private Date pop_end_dte;
	private int pop_width;
	private int pop_height;
	private String pop_again_yn;
	private int pop_day;
	private String pop_program;
	private String pop_del_yn;
	private int pop_hit;
	public int getPop_id() {
		return pop_id;
	}
	public void setPop_id(int pop_id) {
		this.pop_id = pop_id;
	}
	public int getKind_id() {
		return kind_id;
	}
	public void setKind_id(int kind_id) {
		this.kind_id = kind_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPop_title() {
		return pop_title;
	}
	public void setPop_title(String pop_title) {
		this.pop_title = pop_title;
	}
	public String getPop_content() {
		return pop_content;
	}
	public void setPop_content(String pop_content) {
		this.pop_content = pop_content;
	}
	public String getPop_open() {
		return pop_open;
	}
	public void setPop_open(String pop_open) {
		this.pop_open = pop_open;
	}
	public Date getPop_create_dtm() {
		return pop_create_dtm;
	}
	public void setPop_create_dtm(Date pop_create_dtm) {
		this.pop_create_dtm = pop_create_dtm;
	}
	public Date getPop_update_dtm() {
		return pop_update_dtm;
	}
	public void setPop_update_dtm(Date pop_update_dtm) {
		this.pop_update_dtm = pop_update_dtm;
	}
	public Date getPop_start_dte() {
		return pop_start_dte;
	}
	public void setPop_start_dte(Date pop_start_dte) {
		this.pop_start_dte = pop_start_dte;
	}
	public Date getPop_end_dte() {
		return pop_end_dte;
	}
	public void setPop_end_dte(Date pop_end_dte) {
		this.pop_end_dte = pop_end_dte;
	}
	public int getPop_width() {
		return pop_width;
	}
	public void setPop_width(int pop_width) {
		this.pop_width = pop_width;
	}
	public int getPop_height() {
		return pop_height;
	}
	public void setPop_height(int pop_height) {
		this.pop_height = pop_height;
	}
	public String getPop_again_yn() {
		return pop_again_yn;
	}
	public void setPop_again_yn(String pop_again_yn) {
		this.pop_again_yn = pop_again_yn;
	}
	public int getPop_day() {
		return pop_day;
	}
	public void setPop_day(int pop_day) {
		this.pop_day = pop_day;
	}
	public String getPop_program() {
		return pop_program;
	}
	public void setPop_program(String pop_program) {
		this.pop_program = pop_program;
	}
	public String getPop_del_yn() {
		return pop_del_yn;
	}
	public void setPop_del_yn(String pop_del_yn) {
		this.pop_del_yn = pop_del_yn;
	}
	public int getPop_hit() {
		return pop_hit;
	}
	public void setPop_hit(int pop_hit) {
		this.pop_hit = pop_hit;
	}
	@Override
	public String toString() {
		return "PopupVO [pop_id=" + pop_id + ", kind_id=" + kind_id + ", user_id=" + user_id + ", pop_title="
				+ pop_title + ", pop_content=" + pop_content + ", pop_open=" + pop_open + ", pop_create_dtm="
				+ pop_create_dtm + ", pop_update_dtm=" + pop_update_dtm + ", pop_start_dte=" + pop_start_dte
				+ ", pop_end_dte=" + pop_end_dte + ", pop_width=" + pop_width + ", pop_height=" + pop_height
				+ ", pop_again_yn=" + pop_again_yn + ", pop_day=" + pop_day + ", pop_program=" + pop_program
				+ ", pop_del_yn=" + pop_del_yn + ", pop_hit=" + pop_hit + "]";
	}
}
