package com.betrybe.trybetrack.models.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDate;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "bus_lines")
@Audited
public class BusLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    @OneToMany(mappedBy = "busLine", fetch = FetchType.EAGER)
    private List<Schedule> schedules;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "station_bus_lines",
            joinColumns = @JoinColumn(name = "bus_line_id"),
            inverseJoinColumns = @JoinColumn(name = "station_id")
    )
    private List<Station> stations;

    @CreatedDate
    @JsonProperty("created_date")
    private LocalDate createDate;

    @CreatedDate
    @JsonProperty("last_modified_date")
    private LocalDate lastModifiedDate;

    public BusLine() {
    }

    public BusLine(Long id, String code, String name, List<Schedule> schedules, List<Station> stations) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.schedules = schedules;
        this.stations = stations;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDate lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<Station> getStations() {
        return stations;
    }
}
