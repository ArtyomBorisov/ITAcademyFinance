package by.itacademy.account.controller.web.controllers.rest;

import by.itacademy.account.model.Account;
import by.itacademy.account.service.api.IAccountService;
import by.itacademy.account.service.api.MessageError;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping(value = "/account")
@Validated
public class AccountController {

    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Account account) {
        this.accountService.add(account);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Page<Account> index(@RequestParam @Min(value = 0, message = MessageError.PAGE_NUMBER) int page,
                               @RequestParam @Min(value = 1, message = MessageError.PAGE_SIZE) int size) {
        Pageable pageable = Pageable.ofSize(size).withPage(page);
        return this.accountService.get(pageable);
    }

    @GetMapping(value = "/{uuid}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Account index(@PathVariable(name = "uuid") UUID id) {
        return this.accountService.get(id);
    }

    @PutMapping(value = "/{uuid}/dt_update/{dt_update}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable(name = "uuid") UUID id,
                       @PathVariable(name = "dt_update") LocalDateTime dtUpdate,
                       @RequestBody Account account) {
        this.accountService.update(account, id, dtUpdate);
    }
}
