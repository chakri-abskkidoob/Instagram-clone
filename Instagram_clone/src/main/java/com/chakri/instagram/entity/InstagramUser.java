package com.chakri.instagram.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstagramUser {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    
    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between {min} and {max} characters")
    private String name;
    
    @NotBlank(message = "Username is required")
    @Size(min = 2, max = 20, message = "Username must be between {min} and {max} characters")
    @Pattern(regexp = "^[a-zA-Z0-9._]+$", message = "Username must contain only letters, numbers, dots, or underscores")
    private String userName;
    
    private String bio;
    
    private String website;
    
    @Min(0)
    private Integer followerCount = 0;
    
    @Min(0)
    private Integer followingCount = 0;
    
    @Min(0)
    private Integer postCount = 0;
    
    private LocalDateTime createdAt = LocalDateTime.now();
    
    private LocalDateTime updatedAt = LocalDateTime.now();
    
    private Boolean isActive;
}
