package by.epam.preTraining.dukhanin.tasks.task09.model.entities;

import by.epam.preTraining.dukhanin.tasks.task09.model.utils.container.VehicleList;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class RentOrder {
    private long id;
    private VehicleList vehicleList;
    private Date startDate;
    private Date endDate;
    private BigDecimal rentTotal;
    private BigDecimal penalty;

    public RentOrder() {
    }

    public RentOrder(long id, VehicleList vehicleList, Date startDate, Date endDate, BigDecimal rentTotal, BigDecimal penalty) {
        this.id = id;
        this.vehicleList = vehicleList;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentTotal = rentTotal;
        this.penalty = penalty;
    }

    public RentOrder(RentOrder rentOrder) {
        this(rentOrder.id, rentOrder.vehicleList, rentOrder.startDate, rentOrder.endDate, rentOrder.rentTotal, rentOrder.penalty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentOrder rentOrder = (RentOrder) o;
        return id == rentOrder.id &&
                Objects.equals(vehicleList, rentOrder.vehicleList) &&
                Objects.equals(startDate, rentOrder.startDate) &&
                Objects.equals(endDate, rentOrder.endDate) &&
                Objects.equals(rentTotal, rentOrder.rentTotal) &&
                Objects.equals(penalty, rentOrder.penalty);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, vehicleList, startDate, endDate, rentTotal, penalty);
    }

    @Override
    public String toString() {
        return "RentOrder{" +
                "id=" + id +
                ", vehicleList=" + vehicleList +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", rentTotal=" + rentTotal +
                ", penalty=" + penalty +
                '}';
    }

    public VehicleList getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(VehicleList vehicleList) {
        this.vehicleList = vehicleList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
