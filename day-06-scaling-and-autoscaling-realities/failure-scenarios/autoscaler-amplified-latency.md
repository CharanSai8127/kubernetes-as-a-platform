# Autoscaler Amplified Latency

Autoscaling attempts to improve operational responsiveness.

However:
reactive scaling may temporarily increase latency before systems stabilize.

---

# Why Latency Increases

Scaling events require:
- metrics collection
- scheduling
- startup
- readiness validation
- and traffic propagation.

During this convergence delay:
existing workloads continue absorbing traffic spikes.

This creates:
- temporary overload windows.

---

# Startup Pressure

New replicas frequently require:
- image pulling
- dependency initialization
- cache warmup
- and connection establishment

before becoming operationally useful.

Meanwhile:
- overloaded workloads continue serving traffic under pressure.

---

# Scaling Feedback Loops

Increasing replicas may temporarily increase:
- infrastructure contention
- database traffic
- connection pressure
- and startup resource consumption.

This amplifies:
- operational latency
before:
- additional capacity fully stabilizes the system.

---

# Delayed Traffic Convergence

Traffic itself requires time to:
- redistribute toward new replicas.

Existing workloads may therefore remain saturated even after scaling begins.

---

# Operational Perspective

Reliable autoscaling depends heavily on:
- stabilization policies
- startup optimization
- workload-aware metrics
- and operational safety margins.

---

# Key Insight

Reactive scaling frequently improves capacity only after temporary latency amplification already begins.
