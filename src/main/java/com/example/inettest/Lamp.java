package com.example.inettest;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import java.net.InetAddress;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@TypeDef(name = "inet", typeClass = InetAddressType.class)
public class Lamp {
    private Long id;
    private InetAddress ipAddress;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(columnDefinition = "inet")
    @Type(type = "inet")
    public InetAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(InetAddress ipAddress) {
        this.ipAddress = ipAddress;
    }
}
