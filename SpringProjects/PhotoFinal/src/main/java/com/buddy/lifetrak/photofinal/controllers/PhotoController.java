package com.buddy.lifetrak.photofinal.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PhotoController {
	
	
	
	@GetMapping("/")
		public String index() {		
		return "index.jsp";
	}
	
	
	
    @PostMapping("/users/save")
    public RedirectView saveUser(User user,
            @RequestParam("image") MultipartFile multipartFile) throws IOException {
         
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        user.setPhotos(fileName);
         
        User savedUser = repo.save(user);
 
        String uploadDir = "user-photos/" + savedUser.getId();
 
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
         
        return new RedirectView("/users", true);
    } 
}
