package com.baomidou.mybatisplus.test.plugins.optimisticLocker.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;

@TableName("version_user")
public class StringVersionUser implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	@Version
	private String version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
