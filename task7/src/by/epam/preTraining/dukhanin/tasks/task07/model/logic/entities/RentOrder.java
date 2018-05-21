package by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities;

import java.math.BigDecimal;
import java.util.Date;

public class RentOrder {
    private long id;
    private AbstractVehicle vehicle;
    private Date startDate;
    private Date endDate;
    private BigDecimal rentTotal;
    private BigDecimal penalty;

    public RentOrder(long id, AbstractVehicle vehicle, Date startDate, Date endDate, BigDecimal rentTotal, BigDecimal penalty) {
        this.id = id;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentTotal = rentTotal;
        this.penalty = penalty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AbstractVehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(AbstractVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getRentTotal() {
        return rentTotal;
    }

    public void setRentTotal(BigDecimal rentTotal) {
        this.rentTotal = rentTotal;
    }

    public BigDecimal getPenalty() {
        return penalty;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }
}
