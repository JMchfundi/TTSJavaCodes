package co.ke.tucode.controllers;

import java.io.IOException;
import java.net.http.HttpClient.Redirect;
import java.util.List;
import java.util.stream.Collectors;

// import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import co.ke.tucode.payloads.ReverseStringPayload;

// import co.ke.tucode.admin.entities.ProjectInfo;
// import co.ke.tucode.admin.entities.ProjectLocation;
// import co.ke.tucode.admin.entities.ProjectUpload;
// import co.ke.tucode.admin.payloads.ProjectDataPayload;
// import co.ke.tucode.admin.payloads.ProjectLocationPayload;
// import co.ke.tucode.admin.payloads.ProjectUploadPayload;
// import co.ke.tucode.admin.repositories.ProjectInfoRepo;
// import co.ke.tucode.admin.repositories.ProjectLocationRepo;
// import co.ke.tucode.admin.repositories.ProjectUploadRepo;
// import co.ke.tucode.admin.services.ProjectInfoService;
// import co.ke.tucode.buyer.entities.Africana_User;
// import co.ke.tucode.buyer.entities.DocUpload;

@RestController
@RequestMapping("/tucode")
public class ReverseStringController {
    /*
     * .......................obr_get_service retrieve all db
     * data.............................
     */
    @RequestMapping(value = "/reverseString", method = RequestMethod.GET)
    public ResponseEntity<?> get_service() {
        String string = "TTSJavaCode";
        // List<ProjectInfo> projectInfos = projectInfoRepo.findAll();

        if (string == null)
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            
        return new ResponseEntity(ReverseStringPayload.reverseWithIterativeMethod(string), HttpStatus.OK);
    }

}