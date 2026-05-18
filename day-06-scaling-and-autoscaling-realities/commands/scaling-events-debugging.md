# Scaling Events Debugging Commands

## View Cluster Events
kubectl get events --sort-by=.metadata.creationTimestamp

## Watch Events Live
kubectl get events -w

## Inspect Deployment Scaling
kubectl describe deployment <deployment-name>

## Watch Replica Changes
kubectl get rs -w

## Monitor Pod Startup
kubectl get pods -w

## View Pod Scheduling Events
kubectl describe pod <pod-name>

## Check Autoscaling Decisions
kubectl describe hpa <hpa-name>

## View Failed Scheduling Messages
kubectl get events | grep FailedScheduling

## Inspect Node Pressure Events
kubectl describe nodes

## Observe Scaling Latency
kubectl get deploy,pods,hpa -w
