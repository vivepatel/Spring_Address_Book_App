package com.bridgelabz.address_book_app.dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {
    private String name;
    private String email;
    private String phone;
}