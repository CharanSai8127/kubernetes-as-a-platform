# Traffic Debugging

## Check Services

kubectl get svc

## Check Endpoints

kubectl get endpoints

Useful for:
- missing pod registration
- readiness failures
- service routing issues

## Describe Ingress or Gateway

kubectl describe ingress <name>

kubectl describe gateway <name>

## Observe Traffic Errors

kubectl logs <gateway-pod>

Useful for:
- rate limiting
- routing failures
- traffic admission issues
