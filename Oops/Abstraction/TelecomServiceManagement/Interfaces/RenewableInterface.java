package Oops.Abstraction.TelecomServiceManagement.Interfaces;

import Oops.Abstraction.TelecomServiceManagement.Exceptions.InvalidServiceDurationException;

public interface RenewableInterface {
    
    void renewService(int additionalDays) throws InvalidServiceDurationException;
}
