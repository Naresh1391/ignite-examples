package com.bfm.app.ignite.meetup;

import java.util.Collections;
import java.util.List;

import org.apache.ignite.cache.query.annotations.QuerySqlField;
import org.apache.ignite.cache.query.annotations.QueryTextField;

public class Portfolio {

    @QuerySqlField(index = true)
    private final Long id;

    @QueryTextField
    @QuerySqlField(index = true)
    private final String name;

    @QueryTextField
    private String description;

    @QuerySqlField
    private final Double nav;

    private final List<Position> positions;

    public List<Position> getPositions() {
        return positions;
    }

    public Long getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getNav() {
        return nav;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Portfolio(Long id, String name, double nav, List<Position> positions) {
        this.id = id;
        this.name = name;
        this.description = null;
        this.nav = nav;
        this.positions = positions;
    }

    public Portfolio(Long id, String name, String description, double nav, List<Position> positions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.nav = nav;
        this.positions = positions;
    }

    public Portfolio(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.nav = null;
        this.positions = Collections.emptyList();
    }

	@Override
    public String toString() {
        return "Portfolio [portfolioid=" + id + ", name=" + name + ", nav=" + nav + ", positions=" + positions + "]";
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nav == null) ? 0 : nav.hashCode());
		result = prime * result
				+ ((positions == null) ? 0 : positions.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Portfolio other = (Portfolio) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nav == null) {
			if (other.nav != null)
				return false;
		} else if (!nav.equals(other.nav))
			return false;
		if (positions == null) {
			if (other.positions != null)
				return false;
		} else if (!positions.equals(other.positions))
			return false;
		return true;
	}
}
