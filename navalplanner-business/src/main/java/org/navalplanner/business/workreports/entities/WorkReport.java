package org.navalplanner.business.workreports.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.NotNull;
import org.navalplanner.business.common.BaseEntity;

/**
 * @author Diego Pino García <dpino@igalia.com>
 */
public class WorkReport extends BaseEntity {

    public static final String DATE = "date";

    public static final String RESPONSIBLE = "responsible";

    @NotNull
    private Date date;

    private String place;

    @NotEmpty
    private String responsible;

    private WorkReportType workReportType;

    private Set<WorkReportLine> workReportLines = new HashSet<WorkReportLine>();


    public WorkReport() {

    }

    public WorkReport(Date date, String place, WorkReportType workReportType,
            Set<WorkReportLine> workReportLines) {
        this.date = date;
        this.place = place;
        this.workReportType = workReportType;
        this.workReportLines = workReportLines;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public WorkReportType getWorkReportType() {
        return workReportType;
    }

    public void setWorkReportType(WorkReportType workReportType) {
        this.workReportType = workReportType;
    }

    public Set<WorkReportLine> getWorkReportLines() {
        return workReportLines;
    }

    public void setWorkReportLines(Set<WorkReportLine> workReportLines) {
        this.workReportLines = workReportLines;
    }
}
