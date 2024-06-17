package top.zjh.tijian.dto;

public class CalendarRequestDto {

    private Integer hpId;
    private Integer year;
    private Integer month;

    public CalendarRequestDto(Integer hpId, Integer year, Integer month) {
        this.hpId = hpId;
        this.year = year;
        this.month = month;
    }

    public Integer getHpId() {
        return hpId;
    }

    public void setHpId(Integer hpId) {
        this.hpId = hpId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}
