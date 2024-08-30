package com.login_logout.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentResponse {

    private long aid;
    private long did;
    private long pid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime time;

    private DoctorResponse doctorResponse;
    private PatientResponse patientResponse;
    private String status;
    private MedicationResponse medication;

    @Override
    public String toString() {
        return "AppointmentResponse [aid=" + aid + ", did=" + did + ", pid=" + pid + ", date=" + date + ", time=" + time
                + ", doctorResponse=" + doctorResponse + ", patientResponse=" + patientResponse + ", medication=" + medication + "]";
    }
}
