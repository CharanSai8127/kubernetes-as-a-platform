# Probe Debugging

## Check Pod Events

kubectl describe pod <pod-name>

Useful for:
- readiness failures
- liveness failures
- startup probe failures
- restart loops

## Check Restart Count

kubectl get pods

Look for:
- RESTARTS column
- CrashLoopBackOff
- unhealthy probe behavior

## Check Logs

kubectl logs <pod-name>

For previous crashed container:

kubectl logs <pod-name> --previous

## Observe Probe Configuration

kubectl get deploy <deployment-name> -o yaml

Check:
- readinessProbe
- livenessProbe
- startupProbe
- timeoutSeconds
- failureThreshold
