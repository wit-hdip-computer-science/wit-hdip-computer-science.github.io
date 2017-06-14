MyRentV10_Client 

- builds directly on MyRentV09 by:
  - modifying v09, converting it to an android client by adding http networking module.
  - implementing AsynchTask for the C(reate), D(elete) CRUD components
  - implementing IntentService classes to perform R(ead) of Residence list
      - a Broadcast receiver that commences polling server for read updates from start device (BootReceiver) by starting an IntentService (RefreshService)
      - a menu item to facilitate manual refresh (RefreshService)
      - a settings option to set the auto refresh interval (in seconds)