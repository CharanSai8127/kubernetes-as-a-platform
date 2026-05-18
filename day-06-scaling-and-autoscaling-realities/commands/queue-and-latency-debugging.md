# Queue and Latency Debugging Commands

## View Pod Latency Indicators
kubectl logs <pod-name>

## Stream Application Logs
kubectl logs -f <pod-name>

## Inspect Queue Consumer Pods
kubectl get pods

## Monitor Queue Worker Scaling
kubectl get deploy,hpa,pods -w

## Inspect Pod Restart Behavior
kubectl get pods
kubectl describe pod <pod-name>

## Check Failed Requests
kubectl logs <pod-name> | grep ERROR

## View High Latency Events
kubectl get events --sort-by=.metadata.creationTimestamp

## Inspect Network Connectivity
kubectl exec -it <pod-name> -- sh

## Monitor Service Endpoints
kubectl get endpoints

## Watch Queue Backpressure Indicators
kubectl top pods
kubectl get hpa -w
