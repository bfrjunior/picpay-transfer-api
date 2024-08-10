package tech.buildrun.picpay.controller.dto;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.NotBlank;
import tech.buildrun.picpay.entity.Wallet;
import tech.buildrun.picpay.entity.WalletType;

public record CreateWalletDto(@NotBlank String fullName,
        @NotBlank String cpfCnpj,
        @NotBlank String email,
        @NotBlank String password,
        @NonNull WalletType.Enum walletType) {

    public Wallet toWallet() {

        return new Wallet(
                fullName,
                cpfCnpj,
                email,
                password,
                walletType.get());
    }

}
