# Resource Pressure Debugging Commands

## View Pod Resource Usage
kubectl top pods

## View Node Resource Usage
kubectl top nodes

## Inspect Resource Requests and Limits
kubectl describe pod <pod-name>

## Check Node Pressure Conditions
kubectl describe nodes

## Inspect OOM Kills
kubectl get events | grep OOM

## View Evicted Pods
kubectl get pods --all-namespaces | grep Evicted

## Check QoS Classes
kubectl get pod <pod-name> -o yaml | grep qosClass

## Inspect Resource Quotas
kubectl get resourcequota
kubectl describe resourcequota

## View Namespace Limits
kubectl get limitrange
kubectl describe limitrange

## Monitor Resource Pressure Continuously
watch kubectl top pods
