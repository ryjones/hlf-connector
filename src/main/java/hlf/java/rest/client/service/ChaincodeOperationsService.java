package hlf.java.rest.client.service;

import hlf.java.rest.client.model.ChaincodeOperations;
import hlf.java.rest.client.model.ChaincodeOperationsType;

public interface ChaincodeOperationsService {

  /**
   * Perform chaincode operations passed in the arguments.
   *
   * @param networkName the network name
   * @param chaincodeOperationsModel the chaincode operations model
   * @param operationsType the operations type
   * @return the transactionId
   */
  String performChaincodeOperation(
      String networkName,
      ChaincodeOperations chaincodeOperationsModel,
      ChaincodeOperationsType operationsType);

  /**
   * Gets current sequence for the channel and chaincode.
   *
   * @param networkName the network name
   * @param chaincodeName the chaincode name
   * @param chaincodeVersion the chaincode version
   * @return the current sequence
   */
  String getCurrentSequence(String networkName, String chaincodeName, String chaincodeVersion);

  /**
   * Gets current package id for the passed channel and chaincode.
   *
   * @param networkName the network name
   * @param chaincodeName the chaincode name
   * @param chaincodeVersion the chaincode version
   * @return the current package id
   */
  String getCurrentPackageId(String networkName, String chaincodeName, String chaincodeVersion);
}
