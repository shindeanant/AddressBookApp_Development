package com.brideglabz.addressbookapp.exceptions;

@ControllerAdvice
public class AddressBookAppExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException exception) {
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errorMessage = errorList.stream().map(objerr -> objerr.getDefaultMessage())
                .collect(Collectors.toList());

        ResponseDTO responseDTO = new ResponseDTO("Exception while processing REST request", errorMessage);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}