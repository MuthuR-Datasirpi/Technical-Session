package com.Project.SpringCrud.Controller;

import com.Project.SpringCrud.DTO.EmployeeDTO;
import com.Project.SpringCrud.Entity.Employee;
import com.Project.SpringCrud.Service.EmployeeService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;

/**
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     *
     * @param employeeDTO
     * @return
     */
    @PostMapping(path = "/insert")
    public employee saveEmployee(@RequestBody @Valid EmployeeDTO employeeDTO) {
        Employee Success = employeeService.addEmployee(employeeDTO);
        return Success;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    @GetMapping(path = "/select")
    public ResponseEntity<Object> getEmployee(@RequestParam int x, @RequestParam int y) {
        Page<Employee> Data = employeeService.getEmployeeData(x, y);
        return new ResponseEntity<Object>(Data.getContent(), HttpStatus.OK);
    }

@GetMapping("/generate")
public ResponseEntity<byte[]> generateAndDownloadPdf()throws DocumentException{
        try {

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            Document document = new Document();
            PdfWriter.getInstance(document, byteArrayOutputStream);
            document.open();

            for (Employee custom : employeeService.getemployeeData(1,1)) {
                document.add(new Paragraph("Book details"));
                document.add(new Paragraph("________________________________"));
                document.add(new Paragraph("Id: " + custom.getEmployeeid()));
                document.add(new Paragraph("Name: " + custom.getEmployeename()));
                document.add(new Paragraph("Address: " + custom.getEmployeeaddress()));
                document.add(new Paragraph("Mobile: " + custom.getMobile()));
                document.add(new Paragraph("--------------------------------"));
            }


            document.close();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("filename", "generated.pdf");
            //headers.add("Custom-Header", "Custom Value");
            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .body(byteArrayOutputStream.toByteArray());
        } catch (ArithmeticException e) {
            e.printStackTrace();

            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to generate PDF.".getBytes());
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
}
}
