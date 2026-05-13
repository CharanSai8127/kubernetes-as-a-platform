# Resource Debugging

## Check ResourceQuota

kubectl get resourcequota

kubectl describe resourcequota

## Check LimitRange

kubectl get limitrange

kubectl describe limitrange

## Observe Node Resource Usage

kubectl top nodes

## Observe Pod Resource Usage

kubectl top pods

Useful for:
- noisy neighbors
- resource exhaustion
- runaway workloads
- scheduling pressure
