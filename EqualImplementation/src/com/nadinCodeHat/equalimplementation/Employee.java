package com.nadinCodeHat.equalimplementation;

public class Employee {
    private int employeeId;
    private String employeeCode;
    private String name;
    private String nic;
    private String address;

    public Employee() {

    }

    public Employee(int employeeId, String employeeCode, String name, String nic, String address) {
        this.employeeId = employeeId;
        this.employeeCode = employeeCode;
        this.name = name;
        this.nic = nic;
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Check if employeeId and employeeCode are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return getEmployeeId() == employee.getEmployeeId() && getEmployeeCode().equals(employee.getEmployeeCode());
    }
}
